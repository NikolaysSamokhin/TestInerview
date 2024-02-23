package org.testinterview.generators;

import org.testinterview.objects.VirtualReceptionForm;

public class VirtualReceptionGenerator {
    private static final String textOfAppeal = "fffff2353422ffffff343242ffffffewfwefsdzdcxzваываывававыыыыыыыыыыыыыыы" +
                                        "4к43534йейкпаывфпафыdwqdwqeqw111!!!@#*&&^%%&*(())_+_=-0097?>><<";
    public static VirtualReceptionForm VirtualReceptionTestDataGenerator(){

        return VirtualReceptionTestDataGenerator(
                "Test Testov Testovich",
                "432343434",
                "example@yandex.com",
                "г.Ташкент",
                "test address",
                "Физическое лицо",
                "Мужчина",
                "1992-05-06",
                "Заявление",
                "Занят-работаю",
                textOfAppeal
        );
    }

    public static VirtualReceptionForm VirtualReceptionTestDataGenerator(
                                                                            String fullName,
                                                                            String contactPhoneNumber,
                                                                            String email,
                                                                            String region,
                                                                            String address,
                                                                            String subjectType,
                                                                            String gender,
                                                                            String dateOfBirth,
                                                                            String typeOfAppeal,
                                                                            String status,
                                                                            String textOfAppeal
                                                                        )
    {
        return new VirtualReceptionForm.VirtualReceptionFormBuilder()
                .fullName(fullName)
                .contactPhoneNumber(contactPhoneNumber)
                .email(email)
                .region(region)
                .address(address)
                .subjectType(subjectType)
                .gender(gender)
                .dateOfBirth(dateOfBirth)
                .typeOfAppeal(typeOfAppeal)
                .status(status)
                .textOfAppeal(textOfAppeal)
                .build();
    }
}
