package org.testinterview.ui.pages;

import org.apache.log4j.Logger;
import org.testinterview.ui.elements.VirtualReceptionBlockElement;

public class VirtualReceptionPage extends AbstractPage{
    private static final Logger LOG = Logger.getLogger(VirtualReceptionPage.class);
    private VirtualReceptionBlockElement virtualReceptionBlock;

    public VirtualReceptionPage setFullName(String fullName) {
        LOG.trace(String.format("write down a full name %s", fullName));

        virtualReceptionBlock.setFullName(fullName);
        return this;
    }

    public VirtualReceptionPage setContactPhoneNumber(String contactPhoneNumber) {
        LOG.trace(String.format("write down a contact phone number %s", contactPhoneNumber));

        virtualReceptionBlock.setContactPhoneNumber(contactPhoneNumber);
        return this;
    }

    public VirtualReceptionPage setRegion(String region) {
        LOG.trace(String.format("write down a region %s", region));

        virtualReceptionBlock.setRegion(region);
        return this;
    }

    public VirtualReceptionPage setAddress(String address) {
        LOG.trace(String.format("write down an address %s", address));

        virtualReceptionBlock.setAddress(address);
        return this;
    }

    public VirtualReceptionPage setSubjectType(String subjectType) {
        LOG.trace(String.format("write down a subject type %s", subjectType));

        virtualReceptionBlock.setSubjectType(subjectType);
        return this;
    }

    public VirtualReceptionPage setGender(String gender) {
        LOG.trace(String.format("write down a gender %s", gender));

        virtualReceptionBlock.setGender(gender);
        return this;
    }

    public VirtualReceptionPage setDateOfBirth(String dateOfBirth) {
        LOG.trace(String.format("write down a date of birth %s", dateOfBirth));

        virtualReceptionBlock.setDateOfBirth(dateOfBirth);
        return this;
    }

    public VirtualReceptionPage setTypeOfAppeal(String typeOfAppeal) {
        LOG.trace(String.format("write down a type of appeal %s", typeOfAppeal));

        virtualReceptionBlock.setTypeOfAppeal(typeOfAppeal);
        return this;
    }

    public VirtualReceptionPage setStatusInput(String statusInput) {
        LOG.trace(String.format("write down a status input %s", statusInput));

        virtualReceptionBlock.setStatusInput(statusInput);
        return this;
    }

    public VirtualReceptionPage setTextOfAppeal(String textOfAppeal) {
        LOG.trace(String.format("write down a text of appeal %s", textOfAppeal));

        virtualReceptionBlock.setTextOfAppeal(textOfAppeal);
        return this;
    }

}
