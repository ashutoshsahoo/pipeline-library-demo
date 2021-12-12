#!/usr/bin/env groovy
package com.ashu.practice

/**
 * Employee class
 */
class Employee {

   String name
   Integer age

   void increaseAge(Integer years) {
      this.age += years
   }

}
