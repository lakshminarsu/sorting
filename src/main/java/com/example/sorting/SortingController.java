package com.example.sorting;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

@RestController
@RequestMapping("sorting")
public class SortingController {

    @GetMapping
    public Integer[] sortNumbers(@RequestParam Integer[] values) {
        Arrays.sort(values);
        return values;
    }
}
