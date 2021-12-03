package edu.isu.cs.cs2263.hw02.data;

import lombok.*;

@AllArgsConstructor @NoArgsConstructor @ToString(includeFieldNames = false)
public class Course {

    public static final String[] CODES = { "CS", "CHEM", "PHYS", "MATH", "BTNY", "ZOO" };
    public static final String[] DEPTS = { "Computer Science", "Chemistry", "Physics", "Mathematics", "Botany", "Zoology" };


    @Getter @Setter public int number = 0;

    @Getter @Setter public String name = "";

    @Getter @Setter public int Credits = 0;

    @Getter @Setter public String Code = "";
}
