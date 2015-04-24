import sys
import os
from subprocess import Popen, PIPE
#inp = raw_input()
#Input given not as a command line argument but in normal fashion
#summary = str(inp)
summary = sys.argv[1]

p = Popen(['python', 'word2vectSimilarity.py','wordmodel', summary], stdout=PIPE, stderr=PIPE, stdin=PIPE)
output = p.stdout.read()
output = output.split('\n')
glob_value = 0
total = len(output)
for word in output:
    value = 0

    if word != '':
        val = word.split('_')
        val = val[:len(val)-1]
        for score in val:
            value = value + float(score)
        value = value / len(val)

    glob_value += value

glob_value = glob_value / (total-1)
print glob_value
#for word in output:
#    print word
#p.stdin.write(temp)
#print temp
