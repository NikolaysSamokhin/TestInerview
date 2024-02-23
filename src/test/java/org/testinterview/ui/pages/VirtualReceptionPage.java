package org.testinterview.ui.pages;

import org.apache.log4j.Logger;
import org.testinterview.objects.User;
import org.testinterview.ui.elements.VirtualReceptionBlockElement;

public class VirtualReceptionPage extends AbstractPage{
    private static final Logger LOG = Logger.getLogger(VirtualReceptionPage.class);

    VirtualReceptionBlockElement virtualReceptionBlock;

    public VirtualReceptionPage SetFullName(User user) {
        virtualReceptionBlock.setFullName(user);
        return this;
    }

}
