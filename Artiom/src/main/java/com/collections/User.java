package com.collections;

import com.collections.Address;
import java.util.HashMap;
import java.util.Map;

public class User {
    public long id;
    public String username;
    public Map<String, Address> addresses = new HashMap<>();

    }
