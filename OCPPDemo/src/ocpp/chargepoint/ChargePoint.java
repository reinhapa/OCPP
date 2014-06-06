
package ocpp.chargepoint;

import javax.ejb.Stateless;
import javax.jws.WebService;
import javax.xml.ws.BindingType;

@Stateless
@WebService(endpointInterface = "ocpp.chargepoint.ChargePointService")
@BindingType(value = javax.xml.ws.soap.SOAPBinding.SOAP12HTTP_BINDING)
public class ChargePoint implements ChargePointService {

  @Override
  public UpdateFirmwareResponse updateFirmware(UpdateFirmwareRequest parameters) {
    return new UpdateFirmwareResponse();
  }

  @Override
  public CancelReservationResponse cancelReservation(CancelReservationRequest parameters) {
    CancelReservationResponse response = new CancelReservationResponse();
    response.setStatus(CancelReservationStatus.ACCEPTED);
    return response;
  }

  @Override
  public ReserveNowResponse reserveNow(ReserveNowRequest parameters) {
    ReserveNowResponse response = new ReserveNowResponse();
    response.setStatus(ReservationStatus.ACCEPTED);
    return response;
  }

  @Override
  public RemoteStopTransactionResponse remoteStopTransaction(RemoteStopTransactionRequest parameters) {
    RemoteStopTransactionResponse response = new RemoteStopTransactionResponse();
    response.setStatus(RemoteStartStopStatus.ACCEPTED);
    return response;
  }

  @Override
  public GetLocalListVersionResponse getLocalListVersion(GetLocalListVersionRequest parameters) {
    GetLocalListVersionResponse response = new GetLocalListVersionResponse();
    response.setListVersion(0);
    return response;
  }

  @Override
  public RemoteStartTransactionResponse remoteStartTransaction(RemoteStartTransactionRequest parameters) {
    RemoteStartTransactionResponse response = new RemoteStartTransactionResponse();
    response.setStatus(RemoteStartStopStatus.ACCEPTED);
    return response;
  }

  @Override
  public DataTransferResponse dataTransfer(DataTransferRequest parameters) {
    DataTransferResponse response = new DataTransferResponse();
    response.setData("data");
    response.setStatus(DataTransferStatus.ACCEPTED);
    return response;
  }

  @Override
  public GetConfigurationResponse getConfiguration(GetConfigurationRequest parameters) {
    GetConfigurationResponse response = new GetConfigurationResponse();
    response.getConfigurationKey();
    response.getUnknownKey();
    return response;
  }

  @Override
  public ChangeAvailabilityResponse changeAvailability(ChangeAvailabilityRequest parameters) {
    ChangeAvailabilityResponse response = new ChangeAvailabilityResponse();
    response.setStatus(AvailabilityStatus.ACCEPTED);
    return response;
  }

  @Override
  public ClearCacheResponse clearCache(ClearCacheRequest parameters) {
    ClearCacheResponse response = new ClearCacheResponse();
    response.setStatus(ClearCacheStatus.ACCEPTED);
    return response;
  }

  @Override
  public UnlockConnectorResponse unlockConnector(UnlockConnectorRequest parameters) {
    UnlockConnectorResponse response = new UnlockConnectorResponse();
    response.setStatus(UnlockStatus.ACCEPTED);
    return response;
  }

  @Override
  public ResetResponse reset(ResetRequest parameters) {
    ResetResponse response = new ResetResponse();
    response.setStatus(ResetStatus.ACCEPTED);
    return response;
  }

  @Override
  public SendLocalListResponse sendLocalList(SendLocalListRequest parameters) {
    SendLocalListResponse response = new SendLocalListResponse();
    response.setHash("hash");
    response.setStatus(UpdateStatus.ACCEPTED);
    return response;
  }

  @Override
  public ChangeConfigurationResponse changeConfiguration(ChangeConfigurationRequest parameters) {
    ChangeConfigurationResponse response = new ChangeConfigurationResponse();
    response.setStatus(ConfigurationStatus.ACCEPTED);
    return response;
  }

  @Override
  public GetDiagnosticsResponse getDiagnostics(GetDiagnosticsRequest parameters) {
    GetDiagnosticsResponse response = new GetDiagnosticsResponse();
    response.setFileName("filename");
    return response;
  }
}