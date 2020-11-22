package com.hacettepe.rehabsoft.util;

public class ApiPaths {

    private static final String BASE_PATH = "/api";

    public static final class UserPath {
        public static final String CTRL = BASE_PATH + "/users";
    }

    public static final class GeneralEvaluationFormPath {
        public static final String CTRL = BASE_PATH + "/patient/generalevaluationform";
    }

    public static final class PatientFormPath {
        public static final String CTRL = BASE_PATH + "/patient";
    }


    public static final class SavingBotoxImagePath {
        public static final String CTRL = "./src/main/resources/static/generalevaluationform/botoximage/";
    }

    public static final class SavingAppliedSurgeryImagePath {
        public static final String CTRL = "./src/main/resources/static/generalevaluationform/appliedsurgeryimage/";
    }


    public static final class ExercisePath {
        public static final String CTRL = BASE_PATH + "/exercises";
    }

    public static final class SavingOtherOrthesisImagePath {
        public static final String CTRL = "./src/main/resources/static/generalevaluationform/otherorthesisimage/";
    }
}
