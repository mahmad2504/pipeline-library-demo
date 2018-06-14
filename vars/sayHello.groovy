#!/usr/bin/env groovy

def call(String name = 'human') {
  echo "Hello, ${name}."
  println "ls -l".execute().text
}

