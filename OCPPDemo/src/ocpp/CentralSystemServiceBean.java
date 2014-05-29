package ocpp;

import java.util.GregorianCalendar;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.jws.WebService;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.ws.BindingType;

import ocpp.central.AuthorizationStatus;
import ocpp.central.AuthorizeRequest;
import ocpp.central.AuthorizeResponse;
import ocpp.central.BootNotificationRequest;
import ocpp.central.BootNotificationResponse;
import ocpp.central.CentralSystemService;
import ocpp.central.DataTransferRequest;
import ocpp.central.DataTransferResponse;
import ocpp.central.DataTransferStatus;
import ocpp.central.DiagnosticsStatusNotificationRequest;
import ocpp.central.DiagnosticsStatusNotificationResponse;
import ocpp.central.FirmwareStatusNotificationRequest;
import ocpp.central.FirmwareStatusNotificationResponse;
import ocpp.central.HeartbeatRequest;
import ocpp.central.HeartbeatResponse;
import ocpp.central.IdTagInfo;
import ocpp.central.MeterValuesRequest;
import ocpp.central.MeterValuesResponse;
import ocpp.central.RegistrationStatus;
import ocpp.central.StartTransactionRequest;
import ocpp.central.StartTransactionResponse;
import ocpp.central.StatusNotificationRequest;
import ocpp.central.StatusNotificationResponse;
import ocpp.central.StopTransactionRequest;
import ocpp.central.StopTransactionResponse;

@Stateless
@WebService(serviceName = "OCPPDemo", name = "CentralSystemService", targetNamespace = "urn://Ocpp/Cp/2012/06/", endpointInterface = "ocpp.central.CentralSystemService")
@BindingType(value = javax.xml.ws.soap.SOAPBinding.SOAP12HTTP_BINDING)
public class CentralSystemServiceBean implements CentralSystemService {
    @Inject
    private DatatypeFactory factory;
    @Inject
    private GregorianCalendar cal;

    @Override
    public DataTransferResponse dataTransfer(DataTransferRequest parameters) {
        DataTransferResponse response = new DataTransferResponse();
        response.setData("data");
        response.setStatus(DataTransferStatus.ACCEPTED);
        return response;
    }

    @Override
    public StatusNotificationResponse statusNotification(
            StatusNotificationRequest parameters) {
        return new StatusNotificationResponse();
    }

    @Override
    public StopTransactionResponse stopTransaction(
            StopTransactionRequest parameters) {
        IdTagInfo idTagInfo = new IdTagInfo();
        idTagInfo.setExpiryDate(factory.newXMLGregorianCalendar(cal));
        idTagInfo.setParentIdTag("parentId");
        idTagInfo.setStatus(AuthorizationStatus.ACCEPTED);
        StopTransactionResponse response = new StopTransactionResponse();
        response.setIdTagInfo(idTagInfo);
        return response;
    }

    @Override
    public BootNotificationResponse bootNotification(
            BootNotificationRequest parameters) {
        System.out.println("parameters: " + parameters);
        BootNotificationResponse response = new BootNotificationResponse();
        response.setCurrentTime(factory.newXMLGregorianCalendar(cal));
        response.setHeartbeatInterval(20);
        response.setStatus(RegistrationStatus.ACCEPTED);
        return response;
    }

    @Override
    public HeartbeatResponse heartbeat(HeartbeatRequest parameters) {
        HeartbeatResponse response = new HeartbeatResponse();
        response.setCurrentTime(factory.newXMLGregorianCalendar(cal));
        return response;
    }

    @Override
    public MeterValuesResponse meterValues(MeterValuesRequest parameters) {
        return new MeterValuesResponse();
    }

    @Override
    public DiagnosticsStatusNotificationResponse diagnosticsStatusNotification(
            DiagnosticsStatusNotificationRequest parameters) {
        return new DiagnosticsStatusNotificationResponse();
    }

    @Override
    public AuthorizeResponse authorize(AuthorizeRequest parameters) {
        IdTagInfo idTagInfo = new IdTagInfo();
        idTagInfo.setExpiryDate(factory.newXMLGregorianCalendar(cal));
        idTagInfo.setParentIdTag("parentId");
        idTagInfo.setStatus(AuthorizationStatus.ACCEPTED);
        AuthorizeResponse response = new AuthorizeResponse();
        response.setIdTagInfo(idTagInfo);
        return response;
    }

    @Override
    public FirmwareStatusNotificationResponse firmwareStatusNotification(
            FirmwareStatusNotificationRequest parameters) {
        return new FirmwareStatusNotificationResponse();
    }

    @Override
    public StartTransactionResponse startTransaction(
            StartTransactionRequest parameters) {
        IdTagInfo idTagInfo = new IdTagInfo();
        idTagInfo.setExpiryDate(factory.newXMLGregorianCalendar(cal));
        idTagInfo.setParentIdTag("parentId");
        idTagInfo.setStatus(AuthorizationStatus.ACCEPTED);
        StartTransactionResponse response = new StartTransactionResponse();
        response.setIdTagInfo(idTagInfo);
        response.setTransactionId(0);
        return response;
    }
}