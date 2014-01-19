line = LOAD 'var/input.txt' USING PigStorage(' ');
words = FOREACH line GENERATE FLATTEN(TOBAG(*));
g = GROUP words by $0;
out = FOREACH g GENERATE group, COUNT(words); 
