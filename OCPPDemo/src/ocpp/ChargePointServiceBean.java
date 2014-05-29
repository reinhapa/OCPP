package ocpp;

import javax.ejb.Stateless;
import javax.jws.WebService;

import ocpp.chargepoint.AvailabilityStatus;
import ocpp.chargepoint.CancelReservationRequest;
import ocpp.chargepoint.CancelReservationResponse;
import ocpp.chargepoint.CancelReservationStatus;
import ocpp.chargepoint.ChangeAvailabilityRequest;
import ocpp.chargepoint.ChangeAvailabilityResponse;
import ocpp.chargepoint.ChangeConfigurationRequest;
import ocpp.chargepoint.ChangeConfigurationResponse;
import ocpp.chargepoint.ChargePointService;
import ocpp.chargepoint.ClearCacheRequest;
import ocpp.chargepoint.ClearCacheResponse;
import ocpp.chargepoint.ClearCacheStatus;
import ocpp.chargepoint.ConfigurationStatus;
import ocpp.chargepoint.DataTransferRequest;
import ocpp.chargepoint.DataTransferResponse;
import ocpp.chargepoint.DataTransferStatus;
import ocpp.chargepoint.GetConfigurationRequest;
import ocpp.chargepoint.GetConfigurationResponse;
import ocpp.chargepoint.GetDiagnosticsRequest;
import ocpp.chargepoint.GetDiagnosticsResponse;
import ocpp.chargepoint.GetLocalListVersionRequest;
import ocpp.chargepoint.GetLocalListVersionResponse;
import ocpp.chargepoint.RemoteStartStopStatus;
import ocpp.chargepoint.RemoteStartTransactionRequest;
import ocpp.chargepoint.RemoteStartTransactionResponse;
import ocpp.chargepoint.RemoteStopTransactionRequest;
import ocpp.chargepoint.RemoteStopTransactionResponse;
import ocpp.chargepoint.ReservationStatus;
import ocpp.chargepoint.ReserveNowRequest;
import ocpp.chargepoint.ReserveNowResponse;
import ocpp.chargepoint.ResetRequest;
import ocpp.chargepoint.ResetResponse;
import ocpp.chargepoint.ResetStatus;
import ocpp.chargepoint.SendLocalListRequest;
import ocpp.chargepoint.SendLocalListResponse;
import ocpp.chargepoint.UnlockConnectorRequest;
import ocpp.chargepoint.UnlockConnectorResponse;
import ocpp.chargepoint.UnlockStatus;
import ocpp.chargepoint.UpdateFirmwareRequest;
import ocpp.chargepoint.UpdateFirmwareResponse;
import ocpp.chargepoint.UpdateStatus;

@Stateless
@WebService(name = "ChargePointService")
public class ChargePointServiceBean implements ChargePointService {

    @Override
    public UpdateFirmwareResponse updateFirmware(
            UpdateFirmwareRequest parameters) {
        return new UpdateFirmwareResponse();
    }

    @Override
    public CancelReservationResponse cancelReservation(
            CancelReservationRequest parameters) {
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
    public RemoteStopTransactionResponse remoteStopTransaction(
            RemoteStopTransactionRequest parameters) {
        RemoteStopTransactionResponse response = new RemoteStopTransactionResponse();
        response.setStatus(RemoteStartStopStatus.ACCEPTED);
        return response;
    }

    @Override
    public GetLocalListVersionResponse getLocalListVersion(
            GetLocalListVersionRequest parameters) {
        GetLocalListVersionResponse response = new GetLocalListVersionResponse();
        response.setListVersion(0);
        return response;
    }

    @Override
    public RemoteStartTransactionResponse remoteStartTransaction(
            RemoteStartTransactionRequest parameters) {
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
    public GetConfigurationResponse getConfiguration(
            GetConfigurationRequest parameters) {
        GetConfigurationResponse response = new GetConfigurationResponse();
        response.getConfigurationKey();
        response.getUnknownKey();
        return response;
    }

    @Override
    public ChangeAvailabilityResponse changeAvailability(
            ChangeAvailabilityRequest parameters) {
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
    public UnlockConnectorResponse unlockConnector(
            UnlockConnectorRequest parameters) {
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
    public ChangeConfigurationResponse changeConfiguration(
            ChangeConfigurationRequest parameters) {
        ChangeConfigurationResponse response = new ChangeConfigurationResponse();
        response.setStatus(ConfigurationStatus.ACCEPTED);
        return response;
    }

    @Override
    public GetDiagnosticsResponse getDiagnostics(
            GetDiagnosticsRequest parameters) {
        GetDiagnosticsResponse response = new GetDiagnosticsResponse();
        response.setFileName("filename");
        return response;
    }
}