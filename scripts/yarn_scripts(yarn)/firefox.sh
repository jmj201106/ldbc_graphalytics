#!/bin/bash

# create settings
. ./settings.sh

firefox http://`cat $HADOOP_MASTERS`:8088/ & 