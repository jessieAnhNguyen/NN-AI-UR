package learn.nn.core;

/**
 * A PerceptronUnit is a Unit that uses a hard threshold
 * activation function.
 */
public class PerceptronUnit extends NeuronUnit {
	
	/**
	 * The activation function for a Perceptron is a hard 0/1 threshold
	 * at z=0. (AIMA Fig 18.7)
	 */
	@Override
	public double activation(double z) {
		// This must be implemented by you
		if (z>=0) return 1.0;
		else return 0.0;
	}
	
	/**
	 * Update this unit's weights using the Perceptron learning
	 * rule (AIMA Eq 18.7).
	 * Remember: If there are n input attributes in vector x,
	 * then there are n+1 weights including the bias weight w_0. 
	 */
	@Override
	public void update(double[] x, double y, double alpha) {
		double hw = h_w(x);
		// This must be implemented by you
		for (int i = 0; i< this.incomingConnections.size(); i++){
			double xi;
			if (i==0) xi = 1.0;
			else xi = x[i-1];
			this.incomingConnections.get(i).weight += alpha * (y - hw) * xi;
		}
	}
}
