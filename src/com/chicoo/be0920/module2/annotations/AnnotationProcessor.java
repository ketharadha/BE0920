package com.chicoo.be0920.module2.annotations;

public class AnnotationProcessor {

    public static void main(String[] args) {

        //Reflection
        Class<CustomAnnotationUsage> customAnnotationUsageClass = CustomAnnotationUsage.class;

        if (customAnnotationUsageClass.isAnnotationPresent(ClassInfo.class)) {
            ClassInfo classInfo = customAnnotationUsageClass.getAnnotation(ClassInfo.class);
            System.out.println("Author : " + classInfo.author());
            System.out.println("Date : " + classInfo.date());
            System.out.println("Description : " + classInfo.description());
        }
    }
}
