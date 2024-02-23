package org.testinterview.objects;

public class VirtualReceptionForm {
    private String fullName;
    private String contactPhoneNumber;
    private String email;
    private String region;
    private String address;
    private String subjectType;
    private String gender;
    private String dateOfBirth;
    private String typeOfAppeal;
    private String status;
    private String textOfAppeal;

    public VirtualReceptionForm(VirtualReceptionFormBuilder virtualReceptionFormBuilder) {
        this.fullName = virtualReceptionFormBuilder.fullName;
        this.contactPhoneNumber = virtualReceptionFormBuilder.contactPhoneNumber;
        this.email = virtualReceptionFormBuilder.email;
        this.region = virtualReceptionFormBuilder.region;
        this.address = virtualReceptionFormBuilder.address;
        this.subjectType = virtualReceptionFormBuilder.subjectType;
        this.gender = virtualReceptionFormBuilder.gender;
        this.dateOfBirth = virtualReceptionFormBuilder.dateOfBirth;
        this.typeOfAppeal = virtualReceptionFormBuilder.typeOfAppeal;
        this.status = virtualReceptionFormBuilder.status;
        this.textOfAppeal = virtualReceptionFormBuilder.textOfAppeal;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getContactPhoneNumber() {
        return contactPhoneNumber;
    }

    public void setContactPhoneNumber(String contactPhoneNumber) {
        this.contactPhoneNumber = contactPhoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSubjectType() {
        return subjectType;
    }

    public void setSubjectType(String subjectType) {
        this.subjectType = subjectType;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getTypeOfAppeal() {
        return typeOfAppeal;
    }

    public void setTypeOfAppeal(String typeOfAppeal) {
        this.typeOfAppeal = typeOfAppeal;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTextOfAppeal() {
        return textOfAppeal;
    }

    public void setTextOfAppeal(String textOfAppeal) {
        this.textOfAppeal = textOfAppeal;
    }

    public static class VirtualReceptionFormBuilder {
        private String fullName;
        private String contactPhoneNumber;
        private String email;
        private String region;
        private String address;
        private String subjectType;
        private String gender;
        private String dateOfBirth;
        private String typeOfAppeal;
        private String status;
        private String textOfAppeal;

        public VirtualReceptionFormBuilder fullName(String fullName) {
            this.fullName = fullName;
            return this;
        }

        public VirtualReceptionFormBuilder contactPhoneNumber(String contactPhoneNumber) {
            this.contactPhoneNumber = contactPhoneNumber;
            return this;
        }

        public VirtualReceptionFormBuilder email(String email) {
            this.email = email;
            return this;
        }

        public VirtualReceptionFormBuilder region(String region) {
            this.region = region;
            return this;
        }

        public VirtualReceptionFormBuilder address(String address) {
            this.address = address;
            return this;
        }

        public VirtualReceptionFormBuilder subjectType(String subjectType) {
            this.subjectType = subjectType;
            return this;
        }

        public VirtualReceptionFormBuilder gender(String gender) {
            this.gender = gender;
            return this;
        }

        public VirtualReceptionFormBuilder dateOfBirth(String dateOfBirth) {
            this.dateOfBirth = dateOfBirth;
            return this;
        }

        public VirtualReceptionFormBuilder typeOfAppeal(String typeOfAppeal) {
            this.typeOfAppeal = typeOfAppeal;
            return this;
        }

        public VirtualReceptionFormBuilder status(String status) {
            this.status = status;
            return this;
        }

        public VirtualReceptionFormBuilder textOfAppeal(String textOfAppeal) {
            this.textOfAppeal = textOfAppeal;
            return this;
        }

        public VirtualReceptionForm build() {
            VirtualReceptionForm virtualReceptionForm = new VirtualReceptionForm(this);
            return virtualReceptionForm;
        }
    }
}