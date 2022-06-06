package com.eshijiti.docker

import com.eshijiti.utilities.Utilities

def call(Closure body) {
  def utils = new Utilities(this)
  node('master') {
    stage('Tests') {
      echo 'Tests...'
    }
    stage('Build') {
      echo 'Build...'
    }
    stage('Push') {
      echo 'Push'
    }
  }
}