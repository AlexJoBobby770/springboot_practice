package com.alexjo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/software-engineers")
public class SoftwareEngineerController {
    public List<SoftwareEngineer> getEngineers()
    {
        return List.of(
                new SoftwareEngineer(
                        id:1,
                        name:"james"

                )

        )
    }
}

