package learn.lc.core;

public class LogisticClassifier extends LinearClassifier {
	
	public LogisticClassifier(int ninputs) {
		super(ninputs);
	}
	
	/**
	 * A LogisticClassifier uses the logistic update rule
	 * (AIMA Eq. 18.8): w_i \leftarrow w_i+\alpha(y-h_w(x)) \times h_w(x)(1-h_w(x)) \times x_i 
	 */
	public void update(double[] x, double y, double alpha) {
		// This must be implemented by you
		double hw = eval(x);
		for (int i=0; i< this.weights.length; i++){
			this.weights[i] = this.weights[i] + alpha * (y - hw) * hw * (1.0 - hw) * x[i];
		}
	}
	
	/**
	 * A LogisticClassifier uses a 0/1 sigmoid threshold at z=0.
	 */
	public double threshold(double z) {
		// This must be implemented by you
		return 1.0/(1.0 + Math.exp(-z));
	}

}
