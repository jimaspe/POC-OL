package com.poc_accountscanonicalsummary.openlegacy.services.controllers;

import com.poc_accountscanonicalsummary.openlegacy.services.Str002V2Service;
import com.poc_accountscanonicalsummary.openlegacy.services.Str002V2Service.*;

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
@RequestMapping(path = "/api/str002v2", produces = MediaType.APPLICATION_JSON_VALUE)
@Tag(name = "Str002V2")
@OpenlegacyDesigntime(editor = "WebServiceEditor")
public class Str002V2Controller {

    @Autowired
    private Str002V2Service str002V2Service;

    @Operation(summary = "Str002V2 POST operation",
        responses = { @ApiResponse(content = @Content(mediaType = MediaType.APPLICATION_JSON_VALUE, schema = @Schema(implementation = Str002V2Out.class))) },
        security = { @SecurityRequirement(name = "oauth2-password", scopes = "test"), @SecurityRequirement(name = "oauth2", scopes = "test") })
    @PostMapping
    public Str002V2Out getStr002V2(@RequestBody Str002V2In str002V2In) throws Exception {
        return str002V2Service.getStr002V2(str002V2In);
    }
}
