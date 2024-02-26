package org.testinterview.runner;

import org.kohsuke.args4j.CmdLineException;
import org.kohsuke.args4j.CmdLineParser;
import org.testinterview.config.Settings;
import org.testinterview.exceptions.TestNGRunException;
import org.testng.TestNG;
import org.testng.xml.Parser;
import org.testng.xml.XmlSuite;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

public class Runner {

    private static final String SETTING = "Setting: ";
    private static final String ERROR = "Error running Test NG suite";
    protected TestNG testng = new TestNG();
    private String testNgConfig;

    public static void main(String[] args) {
        new Runner(args).run();
    }

    public Runner(String[] args) {
        Settings settings = new Settings();
        CmdLineParser parser = new CmdLineParser(settings);

        try {
            parser.parseArgument(args);
            testNgConfig = settings.testNgPath;
            System.out.println(SETTING + settings);
        }
        catch (CmdLineException e) {
            System.err.println(e.toString());
            parser.printUsage(System.out);
        }
    }

    public void run() {
        try {
            XmlSuite xmlSuite = new Parser(testNgConfig).parseToList()
                    .get(0);
            this.testng.setCommandLineSuite(xmlSuite);
            this.testng.run();
        }
        catch (TestNGRunException ex) {
            throw new TestNGRunException(ERROR + ex.getMessage());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
