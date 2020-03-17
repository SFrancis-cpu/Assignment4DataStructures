package com.sfrancis;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Generics {

    Collection<String> myList = new ArrayList<String>(100);
    Map<VIN,Car> myMap = new HashMap<VIN, Car>(100);


}
