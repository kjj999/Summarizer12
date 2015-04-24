import logging
import sys
#CammandLine arguements:
#1.Word for which similar words to be identified
#for arg in sys.argv:
#    print arg
from gensim.models import word2vec;
#loading Existing model
#model=word2vec.Word2Vec.load('/home/User/Word2VecModelComputerScienceModel');
model=word2vec.Word2Vec.load(sys.argv[1]);
#print model.most_similar(positive=['puppy']);

summary = sys.argv[2]
summary = summary.split()
array = []
for word in summary:
    try:
        x = model.most_similar(positive=word)
        y = ''
        for ele in x:
            y = y + str(ele[1]) + '_' 
        print y
    except:
        x = ''
        print x
