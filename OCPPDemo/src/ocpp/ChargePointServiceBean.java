package ocpp;

import javax.ejb.Stateless;
import javax.jws.WebService;

import ocpp.chargepoint.CancelReservationRequest;
import ocpp.chargepoint.CancelReservationResponse;
import ocpp.chargepoint.ChangeAvailabilityRequest;
import ocpp.chargepoint.ChangeAvailabilityResponse;
import ocpp.chargepoint.ChangeConfigurationRequest;
import ocpp.chargepoint.ChangeConfigurationResponse;
import ocpp.chargepoint.ChargePointService;
import ocpp.chargepoint.ClearCacheRequest;
import ocpp.chargepoint.ClearCacheResponse;
import ocpp.chargepoint.DataTransferRequest;
import ocpp.chargepoint.DataTransferResponse;
import ocpp.chargepoint.GetConfigurationRequest;
import ocpp.chargepoint.GetConfigurationResponse;
import ocpp.chargepoint.GetDiagnosticsRequest;
import ocpp.chargepoint.GetDiagnosticsResponse;
import ocpp.chargepoint.GetLocalListVersionRequest;
import ocpp.chargepoint.GetLocalListVersionResponse;
import ocpp.chargepoint.RemoteStartTransactionRequest;
import ocpp.chargepoint.RemoteStartTransactionResponse;
import ocpp.chargepoint.RemoteStopTransactionRequest;
import ocpp.chargepoint.RemoteStopTransactionResponse;
import ocpp.chargepoint.ReserveNowRequest;
import ocpp.chargepoint.ReserveNowResponse;
import ocpp.chargepoint.ResetRequest;
import ocpp.chargepoint.ResetResponse;
import ocpp.chargepoint.SendLocalListRequest;
import ocpp.chargepoint.SendLocalListResponse;
import ocpp.chargepoint.UnlockConnectorRequest;
import ocpp.chargepoint.UnlockConnectorResponse;
import ocpp.chargepoint.UpdateFirmwareRequest;
import ocpp.chargepoint.UpdateFirmwareResponse;

@Stateless
@WebService(name = "ChargePointService")
public class ChargePointServiceBean implements ChargePointService {

    @Override
    public UpdateFirmwareResponse updateFirmware(
            UpdateFirmwareRequest parameters) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public CancelReservationResponse cancelReservation(
            CancelReservationRequest parameters) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public ReserveNowResponse reserveNow(ReserveNowRequest parameters) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public RemoteStopTransactionResponse remoteStopTransaction(
            RemoteStopTransactionRequest parameters) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public GetLocalListVersionResponse getLocalListVersion(
            GetLocalListVersionRequest parameters) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public RemoteStartTransactionResponse remoteStartTransaction(
            RemoteStartTransactionRequest parameters) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public DataTransferResponse dataTransfer(DataTransferRequest parameters) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public GetConfigurationResponse getConfiguration(
            GetConfigurationRequest parameters) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public ChangeAvailabilityResponse changeAvailability(
            ChangeAvailabilityRequest parameters) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public ClearCacheResponse clearCache(ClearCacheRequest parameters) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public UnlockConnectorResponse unlockConnector(
            UnlockConnectorRequest parameters) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public ResetResponse reset(ResetRequest parameters) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public SendLocalListResponse sendLocalList(SendLocalListRequest parameters) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public ChangeConfigurationResponse changeConfiguration(
            ChangeConfigurationRequest parameters) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public GetDiagnosticsResponse getDiagnostics(
            GetDiagnosticsRequest parameters) {
        // TODO Auto-generated method stub
        return null;
    }

}
