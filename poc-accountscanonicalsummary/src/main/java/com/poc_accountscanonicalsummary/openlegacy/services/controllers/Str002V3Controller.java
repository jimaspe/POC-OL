package com.poc_accountscanonicalsummary.openlegacy.services.controllers;

import com.poc_accountscanonicalsummary.openlegacy.services.Str002V3Service;
import com.poc_accountscanonicalsummary.openlegacy.services.Str002V3Service.*;

import com.poc_accountscanonicalsummary.openlegacy.Interbank;
import com.poc_accountscanonicalsummary.openlegacy.InterbankBsec0198Commarea;
import com.poc_accountscanonicalsummary.openlegacy.InterbankBsec0198Header;
import com.poc_accountscanonicalsummary.openlegacy.InterbankBsecipicCommarea;
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
@RequestMapping(path = "/api/str002v3", produces = MediaType.APPLICATION_JSON_VALUE)
@Tag(name = "Str002V3")
@OpenlegacyDesigntime(editor = "WebServiceEditor")
public class Str002V3Controller {

    @Autowired
    private Str002V3Service str002V3Service;

    @Operation(summary = "Str002V3 POST operation",
        responses = { @ApiResponse(content = @Content(mediaType = MediaType.APPLICATION_JSON_VALUE, schema = @Schema(implementation = Str002V3Out.class))) },
        security = { @SecurityRequirement(name = "oauth2-password", scopes = "test"), @SecurityRequirement(name = "oauth2", scopes = "test") })
    @PostMapping
    public Str002V3Out getStr002V3(@RequestBody Str002V3In str002V3In) throws Exception {
        return str002V3Service.getStr002V3(str002V3In);
    }
}
