
package ocpp.central;

import java.util.GregorianCalendar;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.jws.WebService;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.ws.BindingType;

@Stateless
@WebService(endpointInterface = "ocpp.central.CentralSystemService")
@BindingType(value = javax.xml.ws.soap.SOAPBinding.SOAP12HTTP_BINDING)
public class CentralSystem implements CentralSystemService {
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
  public StatusNotificationResponse statusNotification(StatusNotificationRequest parameters) {
    return new StatusNotificationResponse();
  }

  @Override
  public StopTransactionResponse stopTransaction(StopTransactionRequest parameters) {
    IdTagInfo idTagInfo = new IdTagInfo();
    idTagInfo.setExpiryDate(factory.newXMLGregorianCalendar(cal));
    idTagInfo.setParentIdTag("parentId");
    idTagInfo.setStatus(AuthorizationStatus.ACCEPTED);
    StopTransactionResponse response = new StopTransactionResponse();
    response.setIdTagInfo(idTagInfo);
    return response;
  }

  @Override
  public BootNotificationResponse bootNotification(BootNotificationRequest parameters) {
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
  public DiagnosticsStatusNotificationResponse diagnosticsStatusNotification(DiagnosticsStatusNotificationRequest parameters) {
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
  public FirmwareStatusNotificationResponse firmwareStatusNotification(FirmwareStatusNotificationRequest parameters) {
    return new FirmwareStatusNotificationResponse();
  }

  @Override
  public StartTransactionResponse startTransaction(StartTransactionRequest parameters) {
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