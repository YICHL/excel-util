package com.myframe.excel.annotation;

import com.myframe.excel.formatter.DataFormatter;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author LCH
 * @since 2018-06-13
 */
@Target({ElementType.FIELD,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface ExcelColumn {

    /**
     * specified the column name for excel
     */
    String columnName() default "";

    /**
     * default value
     */
    String value() default "";

    /**
     * Marks the location of the generated column,The default value is -1,
     * which means the location of columns generated by read order
     */
    int order() default -1;

    /**
     * format data for export file or convert data for import file
     */
    Class<? extends DataFormatter> formatter() default DataFormatter.class;

    /**
     * format data for export file or convert data for import file
     */
    String formatterClassName() default "";
}
