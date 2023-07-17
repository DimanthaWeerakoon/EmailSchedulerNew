package emailscheduler.Controllers;

import EmailScheduler.Entity.EmailSchedule;
import EmailScheduler.Services.EmailScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/email-schedules")
public class EmailScheduleController {

    private final EmailScheduleService emailScheduleService;

    @Autowired
    public EmailScheduleController(EmailScheduleService emailScheduleService) {
        this.emailScheduleService = emailScheduleService;
    }

    @PostMapping
    public EmailSchedule createEmailSchedule(@RequestBody EmailSchedule emailSchedule) {
        return emailScheduleService.createEmailSchedule(emailSchedule);
    }

}
