package com.poc_accountscanonicalsummary.openlegacy.services;

import org.apache.commons.lang3.StringUtils;
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
import org.openlegacy.core.rpc.actions.RpcActions;

import org.openlegacy.core.annotations.services.*;
import org.openlegacy.core.annotations.OpenlegacyDesigntime;
import org.openlegacy.impl.services.ws.ServiceBinder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.context.ApplicationContext;
import org.openlegacy.utils.ActionUtil;

/**
 *  A service implementation which invokes OpenLegacy API, and returns a service output.
 *  The code below should be customize to perform a working scenario which goes through the relevant screens.
 *  Can be tested by invoking the test Str002V2ServiceTest.
 *  The interface Str002V2Service can be customized to enabling passing parameters to the service, and this class can consume the parameters within the relevant screens.
 */
@Service(name = "Str002V2")
@OpenlegacyDesigntime(editor = "WebServiceEditor")
@Component
public class Str002V2ServiceImpl implements Str002V2Service {

    @Autowired
    private ApplicationContext applicationContext;


    @Autowired
    private ServiceBinder serviceBinder;

    @Override
    @ServiceMethod(name = "getStr002V2", entities = {
            @EntityMapping(alias="interbank", entity=com.poc_accountscanonicalsummary.openlegacy.Interbank.class)})
    @LogServiceUsage
    @BindInputs(endpoints = {
            @BindTo(endpoint = "interbank.bsec0198Commarea.bsec0198Header", expression = "bsec0198Header"),
            @BindTo(endpoint = "interbank.stj002Commarea.stj002Input", expression = "stj002Input")})
    @BindOutputs(endpoints = {
            @BindFrom(endpoint = "stj002Output", expression = "interbank.stj002Commarea.stj002Output")})
    public Str002V2Out getStr002V2(Str002V2In str002V2In) throws Exception {
        Str002V2Out str002V2Out = new Str002V2Out();
        /* autogenerated - sessions block start*/
        ;
        RpcSession pocAccountscanonicalsummarySdkSession = applicationContext.getBean("pocAccountscanonicalsummarySdkSession", RpcSession.class);
        /* autogenerated - sessions block end */
        ;

        try {
            /* autogenerated - execution block start */;
            Interbank interbank = serviceBinder.bindInputs(this, "getStr002V2", "interbank", new Interbank(), str002V2In);
            interbank = pocAccountscanonicalsummarySdkSession.doAction(ActionUtil.getRpcAction(Interbank.class), interbank);
            /* autogenerated - execution block end */;

            /* autogenerated - output block start */;
            str002V2Out = serviceBinder.bindOutput(this, "getStr002V2", str002V2Out, new String[]{"str002V2In", "interbank"}, str002V2In, interbank);
            /* autogenerated - output block end */;

            return str002V2Out;
        } finally {
            /* autogenerated - disconnect block start */
            ;
            pocAccountscanonicalsummarySdkSession.disconnect();
            /* autogenerated - disconnect block end */
            ;
        }
    }

}
