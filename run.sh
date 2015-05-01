#!/bin/sh
stdbuf -i0 -o0 cat /dev/lirc0 > myfifo &
trap 'kill $!' INT
java -Djava.util.logging.config.file="$1" -jar Morse.jar myfifo

