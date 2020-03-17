package com.sfrancis;

import java.util.HashSet;
import java.util.*;

public class SetExample {

        public static void main(String[] args)
        {
            // Set demonstration using HashSet
            Set<String> hash_Set = new HashSet<String>();
            hash_Set.add("This");
            hash_Set.add("is");
            hash_Set.add("My");
            hash_Set.add("Set");
            hash_Set.add("Example");
            System.out.print("This is the set example ");

            System.out.println(hash_Set);

            // Set demonstration using TreeSet
            System.out.print("Sorted Set after passing into TreeSet");
            Set<String> tree_Set = new TreeSet<String>(hash_Set);
            System.out.println(tree_Set);
        }
    }
