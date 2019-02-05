import java.util.Date;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("3231ae30-a7f4-4829-b3d3-b56e2d78dbca")
public class OperationBancaire {

    //Attributes

    @objid ("91260791-8615-4956-b0fa-12fa02578ee8")
    private NatureOperation nature;

    @objid ("89b06e46-9a93-4ec8-9fd1-bac427165fb8")
    private float Montant;

    @objid ("3e87b797-04ff-48cf-924e-85a330821674")
    private Date dateOperation;

    //Constructor

    @objid ("d5c78079-4cb0-46be-9afd-b35ca465aabb")
    public OperationBancaire(float montant, NatureOperation nature) {
    }

}
