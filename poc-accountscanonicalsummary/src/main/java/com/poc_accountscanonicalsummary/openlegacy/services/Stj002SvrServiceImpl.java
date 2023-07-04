package com.poc_accountscanonicalsummary.openlegacy.services;

import org.apache.commons.lang3.StringUtils;
import com.poc_accountscanonicalsummary.openlegacy.Stj002;
import com.poc_accountscanonicalsummary.openlegacy.Stj002Stj002Controls;
import com.poc_accountscanonicalsummary.openlegacy.Stj002Stj002Fecape;
import com.poc_accountscanonicalsummary.openlegacy.Stj002Stj002Input;
import com.poc_accountscanonicalsummary.openlegacy.Stj002Stj002Msjret;
import com.poc_accountscanonicalsummary.openlegacy.Stj002Stj002Output;
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
 *  Can be tested by invoking the test Stj002SvrServiceTest.
 *  The interface Stj002SvrService can be customized to enabling passing parameters to the service, and this class can consume the parameters within the relevant screens.
 */
@Service(name = "Stj002Svr")
@OpenlegacyDesigntime(editor = "WebServiceEditor")
@Component
public class Stj002SvrServiceImpl implements Stj002SvrService {

    @Autowired
    private ApplicationContext applicationContext;


    @Autowired
    private ServiceBinder serviceBinder;

    @Override
    @ServiceMethod(name = "getStj002Svr", entities = {
            @EntityMapping(alias="stj002", entity=com.poc_accountscanonicalsummary.openlegacy.Stj002.class)})
    @LogServiceUsage
    @BindInputs(endpoints = {
            @BindTo(endpoint = "stj002.stj002Input", expression = "stj002Input")})
    @BindOutputs(endpoints = {
            @BindFrom(endpoint = "stj002Output", expression = "stj002.stj002Output")})
    public Stj002SvrOut getStj002Svr(Stj002SvrIn stj002SvrIn) throws Exception {
        Stj002SvrOut stj002SvrOut = new Stj002SvrOut();
        /* autogenerated - sessions block start*/
        ;
        RpcSession pocAccountscanonicalsummarySdkSession = applicationContext.getBean("pocAccountscanonicalsummarySdkSession", RpcSession.class);
        /* autogenerated - sessions block end */
        ;

        try {
            /* autogenerated - execution block start */;
            Stj002 stj002 = serviceBinder.bindInputs(this, "getStj002Svr", "stj002", new Stj002(), stj002SvrIn);
            stj002 = pocAccountscanonicalsummarySdkSession.doAction(ActionUtil.getRpcAction(Stj002.class), stj002);
            /* autogenerated - execution block end */;

            /* autogenerated - output block start */;
            stj002SvrOut = serviceBinder.bindOutput(this, "getStj002Svr", stj002SvrOut, new String[]{"stj002SvrIn", "stj002"}, stj002SvrIn, stj002);
            /* autogenerated - output block end */;

            return stj002SvrOut;
        } finally {
            /* autogenerated - disconnect block start */
            ;
            pocAccountscanonicalsummarySdkSession.disconnect();
            /* autogenerated - disconnect block end */
            ;
        }
    }

}