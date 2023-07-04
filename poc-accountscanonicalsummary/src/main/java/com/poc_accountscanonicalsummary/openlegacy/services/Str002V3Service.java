package com.poc_accountscanonicalsummary.openlegacy.services;


import io.swagger.v3.oas.annotations.media.Schema;
import org.openlegacy.core.annotations.services.Service;
import org.openlegacy.core.annotations.OpenlegacyDesigntime;
import lombok.Getter;
import lombok.Setter;

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

/**
 *  A service interface and input/output definition for a web service.
 *  Defines the contract between the client and server. The client uses the same interface for testing the service via Java code. 
 *  The interface Str002V3Service can be customized to enabling passing parameters to the service.     
 */

@Service(name = "Str002V3")
@OpenlegacyDesigntime(editor = "WebServiceEditor")
public interface Str002V3Service {

    public Str002V3Out getStr002V3(Str002V3In str002V3In) throws Exception;

    @Getter
    @Setter
    public static class Str002V3In {
        
        InterbankBsec0198Commarea bsec0198Commarea;
        
        InterbankStj002Input stj002Input;

    }
    
    @Schema(name = "Str002V3Out", description = "")
    @Getter
    @Setter
    public static class Str002V3Out {
        
        @Schema(description = "Interbank Stj002Output")
        InterbankStj002Output stj002Output;
    }
}
