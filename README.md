# NN-AI-UR
This project implements and evaluates machine learning methods including linear classifiers and neural networks
Important instructions for compiling and building:  
+ Make sure you're in the parent folder of “learn” (which means: cd src)
+ Compile all java files: javac */*/*/*.java  
  
I.	Linear Classifiers:  
1.	Perceptron Classifier: 
General command line: either run the class PerceptronClassifierTest or PerceptronClassifierWithDisplay (both ways give the same result):
•	PerceptronClassifierTest: java learn/lc/examples/PerceptronClassifierTest [filename] [nsteps] [alpha] (specify alpha=0 to use decaying learning rate schedule).

•	PerceptronClassifierWithDisplay: java learn/lc/examples/PerceptronClassifierWithDisplay [filename] [nsteps] [alpha]  (specify alpha=0 to use decaying learning rate schedule). 

2. Logistic Classifier:  
General command line: either run the class LogisticClassifierTest or LogisticClassifierWithDisplay 
•	LogisticClassifierTest: java learn/lc/examples/LogisticClassifierTest [filename] [nsteps] [alpha]  (specify alpha=0 to use decaying learning rate schedule).  
•	LogisticClassifierWithDisplay: java learn/lc/examples/LogisticClassifierWithDisplay [filename] [nsteps] [alpha]  
(specify alpha=0 to use decaying learning rate schedule).   


II.	Neural Network:
1.	Majority Perceptron:  
-	Command:  
•	java learn/nn/examples/MajorityPerceptronNN (default: nmax = 100, nstep = 5)  
 	OR 
•	java learn/nn/examples/MajorityPerceptronNN [nmax] [nstep] (specify nmax and nstep)

=> Example: 
•	java learn/nn/examples/MajorityPerceptronNN
OR
•	java learn/nn/examples/MajorityPerceptronNN 3000 100

2. Iris Neural Network:  
- Command:  
•	java learn/nn/examples/IrisNN (default: epochs = 1000, alpha = 0.1)  
OR 
•	java learn/nn/examples/IrisNN [epochs] [alpha] (specify number of epochs and alpha)

=> Example: 
•	java learn/nn/examples/IrisNN 
OR
•	java learn/nn/examples/IrisNN 3000 0.1   

3. XOR Neural Network:  
- Command:  
•	java learn/nn/examples/XorNN (default: epochs = 1000, alpha = 0.1)  
OR 
•	java learn/nn/examples/XorNN [epochs] [alpha] (specify number of epochs and alpha)

=> Example: java learn/nn/examples/XorNN 3000 0.1   

4. MNIST Neural Network:  
- Command:  java learn/nn/examples/MNISTNN (default: epochs = 100, alpha = 0.1)


