package mycodes;

import org.cloudbus.cloudsim.Cloudlet;
import org.cloudbus.cloudsim.UtilizationModel;

 
public class Deadline extends Cloudlet {

    private int cloudlet_deadline = 0;
    
    
    public Deadline(int cloudletId, long cloudletLength, int pesNumber, long cloudletFileSize, long cloudletOutputSize, UtilizationModel utilizationModelCpu, UtilizationModel utilizationModelRam, UtilizationModel utilizationModelBw) {
        super(cloudletId, cloudletLength, pesNumber, cloudletFileSize, cloudletOutputSize, utilizationModelCpu, utilizationModelRam, utilizationModelBw);
    }
    
    public Deadline(int cloudletId, long cloudletLength, int pesNumber, long cloudletFileSize, long cloudletOutputSize, UtilizationModel utilizationModelCpu, UtilizationModel utilizationModelRam, UtilizationModel utilizationModelBw, int deadline) {
        super(cloudletId, cloudletLength, pesNumber, cloudletFileSize, cloudletOutputSize, utilizationModelCpu, utilizationModelRam, utilizationModelBw);
        this.cloudlet_deadline = deadline;
    }

    public int getCloudlet_deadline() {
        return cloudlet_deadline;
    }

    public void setCloudlet_deadline(int cloudlet_deadline) {
        this.cloudlet_deadline = cloudlet_deadline;
    }
}
