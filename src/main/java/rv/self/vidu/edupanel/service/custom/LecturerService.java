package rv.self.vidu.edupanel.service.custom;

import rv.self.vidu.edupanel.service.SuperService;
import rv.self.vidu.edupanel.to.LecturerTO;
import rv.self.vidu.edupanel.to.request.LecturerReqTO;
import rv.self.vidu.edupanel.util.LecturerType;

import java.util.List;

public interface LecturerService extends SuperService {

//    void setPictureRepository(PictureRepository pictureRepository);
//    void setLinkedInRepository(LinkedInRepository linkedInRepository);
//    void setLecturerRepository(LecturerRepository lecturerRepository);

    LecturerTO saveLecturer(LecturerReqTO lecturerReqTO);

    void updateLecturerDetails(LecturerReqTO lecturerReqTO);

    void updateLecturerDetails(LecturerTO lecturerTO);

    void deleteLecturer(Integer lecturerId);

    LecturerTO getLecturerDetails(Integer lecturerId);

    List<LecturerTO> getLecturers(LecturerType type);
}
