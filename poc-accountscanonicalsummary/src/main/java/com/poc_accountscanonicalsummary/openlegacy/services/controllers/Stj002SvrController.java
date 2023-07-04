package com.poc_accountscanonicalsummary.openlegacy.services.controllers;

import com.poc_accountscanonicalsummary.openlegacy.services.Stj002SvrService;
import com.poc_accountscanonicalsummary.openlegacy.services.Stj002SvrService.*;

import com.poc_accountscanonicalsummary.openlegacy.Stj002;
import com.poc_accountscanonicalsummary.openlegacy.Stj002Stj002Controls;
import com.poc_accountscanonicalsummary.openlegacy.Stj002Stj002Fecape;
import com.poc_accountscanonicalsummary.openlegacy.Stj002Stj002Input;
import com.poc_accountscanonicalsummary.openlegacy.Stj002Stj002Msjret;
import com.poc_accountscanonicalsummary.openlegacy.Stj002Stj002Output;
import org.openlegacy.core.rpc.RpcSession;

import org.openlegacy.core.annotations.OpenlegacyDesigntime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;

@RestController
@RequestMapping(path = "/api/stj002svr", produces = MediaType.APPLICATION_JSON_VALUE)
@Tag(name = "Stj002Svr")
@OpenlegacyDesigntime(editor = "WebServiceEditor")
public class Stj002SvrController {

    @Autowired
    private Stj002SvrService stj002SvrService;

    @Operation(summary = "Stj002Svr POST operation",
        responses = { @ApiResponse(content = @Content(mediaType = MediaType.APPLICATION_JSON_VALUE, schema = @Schema(implementation = Stj002SvrOut.class))) },
        security = { @SecurityRequirement(name = "oauth2-password", scopes = "test"), @SecurityRequirement(name = "oauth2", scopes = "test") })
    @PostMapping
    public Stj002SvrOut getStj002Svr(@RequestBody Stj002SvrIn stj002SvrIn) throws Exception {
        return stj002SvrService.getStj002Svr(stj002SvrIn);
    }
}
