#!/bin/bash

echo "**********************************************************************"
echo "***** starting 'tb.sh' script version : '2023/12/21'"
echo "***** Application build"
echo "**********************************************************************"
echo ""


echo "***** Build your Application : start"
./gradlew wrapper
./gradlew clean
./gradlew build TBApplicationTarGz TBWebServerTarGz
echo "***** Build your Application : end"
echo ""
cd BilanCarboneCAF/build/distributions
open .
