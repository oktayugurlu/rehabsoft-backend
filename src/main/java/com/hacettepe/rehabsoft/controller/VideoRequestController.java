package com.hacettepe.rehabsoft.controller;

import com.hacettepe.rehabsoft.service.VideoRequestService;
import com.hacettepe.rehabsoft.util.ApiPaths;
import io.swagger.annotations.Api;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RequestMapping(ApiPaths.NotificationPath.CTRL)
@RestController
@Api(value = "/api/users/notification")
@RequiredArgsConstructor
public class VideoRequestController {
    private final VideoRequestService videoRequestService;
}
