#!/bin/bash

GRAILS_VERSION="2.0.0.M2"
rm -fv .tmp
rm -fv .classpath.final

echo '<?xml version="1.0" encoding="UTF-8"?>' > .classpath.final
echo '<classpath>' >> .classpath.final
cat .classpath | grep classpathentry | egrep -v  'classpathentry kind="lib"' | egrep -v plugin-classes >> .classpath.final
echo '	<classpathentry kind="lib" path="'$HOME'/.grails/'$GRAILS_VERSION'/projects/'${PWD##*/}'/plugin-classes"/>' >>	 .classpath.final

find ~/.grails/ivy-cache/  -type f -name "*.jar" | xargs -0 -I entry echo entry | grep jar >> .tmp 
while read line    
do
  echo -e "	<classpathentry kind=\"lib\" path=\"$line\"/>" >> .classpath.final
done < .tmp

echo '</classpath>' >> .classpath.final
mv -fv .classpath.final .classpath
rm -fv .tmp
rm -fv .classpath.final
echo 'finish'
