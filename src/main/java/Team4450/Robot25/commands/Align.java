// package Team4450.Robot25.commands;

// import java.util.Optional;

// import Team4450.Robot25.subsystems.DriveBase;
// import Team4450.Robot25.subsystems.PhotonVision;
// import edu.wpi.first.math.controller.PIDController;
// import edu.wpi.first.wpilibj.DriverStation;
// import edu.wpi.first.wpilibj.DriverStation.Alliance;
// import edu.wpi.first.math.geometry.Rotation2d;
// import edu.wpi.first.math.geometry.Translation2d;

// public class Align {
//     PIDController rotationController = new PIDController(0.02, 0, 0); // for rotating drivebase
//     PIDController translationControllerX = new PIDController(0.1, 0.1, 0); // for moving drivebase in X plane
//     PIDController translationControllerY = new PIDController(0.1, 0.1, 0); // for moving drivebase in Y plane
//     DriveBase robotDrive;
//     PhotonVision photonVision;
//     private Rotation2d targetAngleRotation2d;
//     private boolean alsoDrive;
//     private boolean initialFieldRel;
//     private boolean isFinished;
//     private double toleranceX = 0.05;
//     private double toleranceY = 0.05;
//     private double toleranceRot = 1;

//     public Align(DriveBase robotDrive, PhotonVision photonVision, boolean alsoDrive, boolean initialFieldRel) {
//         this.robotDrive = robotDrive;
//         this.photonVision = photonVision;
//         this.alsoDrive = alsoDrive;
//         isFinished = false;
//     }

//     public void initialize() {
    

//         double targetAngle = robotDrive.getGyroYaw2d().getDegrees();
//         int targetID = photonVision.getClosestTarget().getFiducialId();

//         Optional<Alliance> alliance = DriverStation.getAlliance();
//         if (alliance.isPresent() && alliance.get() == Alliance.Red) {
//             if (targetAngle <= 0.0) {
//                 targetAngle = targetAngle + 180.0;
//             } else {
//                 targetAngle = targetAngle - 180.0;
//             }
//         }   

//         targetAngleRotation2d = Rotation2d.fromDegrees(targetAngle);
//     }

//     public static Translation2d rotateTranslation(
//         Translation2d translationToRotate,
//         Rotation2d rotation
//     ){
//         return translationToRotate.rotateBy(rotation);
//     }

//     public void execute(){
//         double velocityX = -translationControllerX.calculate(
//             0
//         );
//     }
// }
