package org.testinterview.ui.pages;

import org.apache.log4j.Logger;
import org.testinterview.objects.User;
import org.testinterview.ui.elements.VirtualReceptionBlock;

public class VirtualReceptionPage extends AbstractPage{
    private static final Logger LOG = Logger.getLogger(VirtualReceptionPage.class);

    VirtualReceptionBlock virtualReceptionBlock;

    public VirtualReceptionPage SetFullName(User user) {
        virtualReceptionBlock.setFullName(user);
        return this;
    }

}
