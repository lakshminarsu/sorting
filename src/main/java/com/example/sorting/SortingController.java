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
        int arrayLength = values.length;
        int temp = 0;
        for (int i = 0; i < arrayLength; i++) {
          for (int j = 1; j < (arrayLength - i); j++) {
            if (values[j - 1] > values[j]) {
              temp = values[j - 1];
              values[j - 1] = values[j];
              values[j] = temp;
            }
          }
        }
        return values;
    }
}
