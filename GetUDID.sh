system_profiler SPUSBDataType | sed -n -E -e '/(iPhone|iPad)/,/Serial/s/ Serial Number:\ (.+)/\1/p' | sed -e 's/^[ \t]*//'