package com.poc_accountscanonicalsummary.openlegacy.services;


import io.swagger.v3.oas.annotations.media.Schema;
import org.openlegacy.core.annotations.services.Service;
import org.openlegacy.core.annotations.OpenlegacyDesigntime;
import lombok.Getter;
import lombok.Setter;

import com.poc_accountscanonicalsummary.openlegacy.Stj002;
import com.poc_accountscanonicalsummary.openlegacy.Stj002Stj002Controls;
import com.poc_accountscanonicalsummary.openlegacy.Stj002Stj002Fecape;
import com.poc_accountscanonicalsummary.openlegacy.Stj002Stj002Input;
import com.poc_accountscanonicalsummary.openlegacy.Stj002Stj002Msjret;
import com.poc_accountscanonicalsummary.openlegacy.Stj002Stj002Output;
import org.openlegacy.core.rpc.RpcSession;

/**
 *  A service interface and input/output definition for a web service.
 *  Defines the contract between the client and server. The client uses the same interface for testing the service via Java code. 
 *  The interface Stj002SvrService can be customized to enabling passing parameters to the service.     
 */

@Service(name = "Stj002Svr")
@OpenlegacyDesigntime(editor = "WebServiceEditor")
public interface Stj002SvrService {

    public Stj002SvrOut getStj002Svr(Stj002SvrIn stj002SvrIn) throws Exception;

    @Getter
    @Setter
    public static class Stj002SvrIn {
        
        Stj002Stj002Input stj002Input;

    }
    
    @Schema(name = "Stj002SvrOut", description = "")
    @Getter
    @Setter
    public static class Stj002SvrOut {
        
        @Schema(description = "Stj002Stj002Output")
        Stj002Stj002Output stj002Output;
    }
}
