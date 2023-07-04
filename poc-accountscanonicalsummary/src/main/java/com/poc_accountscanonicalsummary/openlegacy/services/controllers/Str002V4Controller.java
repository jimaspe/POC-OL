package com.poc_accountscanonicalsummary.openlegacy.services.controllers;

import com.poc_accountscanonicalsummary.openlegacy.services.Str002V4Service;
import com.poc_accountscanonicalsummary.openlegacy.services.Str002V4Service.*;

import com.poc_accountscanonicalsummary.openlegacy.Interbank;
import com.poc_accountscanonicalsummary.openlegacy.InterbankBsec0198Commarea;
import com.poc_accountscanonicalsummary.openlegacy.InterbankBsec0198Header;
import com.poc_accountscanonicalsummary.openlegacy.InterbankStj002Commarea;
import com.poc_accountscanonicalsummary.openlegacy.InterbankStj002Controls;
import com.poc_accountscanonicalsummary.openlegacy.InterbankStj002Fecape;
import com.poc_accountscanonicalsummary.openlegacy.InterbankStj002Input;
import com.poc_accountscanonicalsummary.openlegacy.InterbankStj002Msjret;
import com.poc_accountscanonicalsummary.openlegacy.InterbankStj002Output;
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
@RequestMapping(path = "/api/str002v4", produces = MediaType.APPLICATION_JSON_VALUE)
@Tag(name = "Str002V4")
@OpenlegacyDesigntime(editor = "WebServiceEditor")
public class Str002V4Controller {

    @Autowired
    private Str002V4Service str002V4Service;

    @Operation(summary = "Str002V4 POST operation",
        responses = { @ApiResponse(content = @Content(mediaType = MediaType.APPLICATION_JSON_VALUE, schema = @Schema(implementation = Str002V4Out.class))) },
        security = { @SecurityRequirement(name = "oauth2-password", scopes = "test"), @SecurityRequirement(name = "oauth2", scopes = "test") })
    @PostMapping
    public Str002V4Out getStr002V4(@RequestBody Str002V4In str002V4In) throws Exception {
        return str002V4Service.getStr002V4(str002V4In);
    }
}
