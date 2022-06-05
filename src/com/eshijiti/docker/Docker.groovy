#!/usr/bin/groovy
package com.eshijiti.docker

class Docker implements Serializable {
    def steps
    Docker(steps) {
        this.steps = steps
    }
    
    def build(args) {
        return "docker build "
    }
}