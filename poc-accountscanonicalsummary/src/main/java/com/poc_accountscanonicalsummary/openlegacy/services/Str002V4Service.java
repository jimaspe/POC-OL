package com.poc_accountscanonicalsummary.openlegacy.services;


import io.swagger.v3.oas.annotations.media.Schema;
import org.openlegacy.core.annotations.services.Service;
import org.openlegacy.core.annotations.OpenlegacyDesigntime;
import lombok.Getter;
import lombok.Setter;

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

/**
 *  A service interface and input/output definition for a web service.
 *  Defines the contract between the client and server. The client uses the same interface for testing the service via Java code. 
 *  The interface Str002V4Service can be customized to enabling passing parameters to the service.     
 */

@Service(name = "Str002V4")
@OpenlegacyDesigntime(editor = "WebServiceEditor")
public interface Str002V4Service {

    public Str002V4Out getStr002V4(Str002V4In str002V4In) throws Exception;

    @Getter
    @Setter
    public static class Str002V4In {
        
        InterbankBsec0198Header bsec0198Header;
        
        InterbankStj002Input stj002Input;

    }
    
    @Schema(name = "Str002V4Out", description = "")
    @Getter
    @Setter
    public static class Str002V4Out {
        
        @Schema(description = "Interbank Stj002Output")
        InterbankStj002Output stj002Output;
    }
}
