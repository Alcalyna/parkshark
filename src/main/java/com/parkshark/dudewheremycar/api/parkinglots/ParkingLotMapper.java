package com.parkshark.dudewheremycar.api.parkinglots;

import com.parkshark.dudewheremycar.domain.parkinglots.ParkingLot;
import org.springframework.stereotype.Component;

@Component
public class ParkingLotMapper {

    public ParkingLot mapDtoToParkingLot(ParkingLotDto parkingLotDtoToMap) {
        ParkingLot createdParkingLot = ParkingLot.ParkingLotBuilder.aParkingLot()
                .withName(parkingLotDtoToMap.getName())
                .withParkingLotCategory(parkingLotDtoToMap.getParkingLotCategory())
                .withMaxCapacity(parkingLotDtoToMap.getMaxCapacity())
                .withContactPerson(parkingLotDtoToMap.getContactPerson())
                .withAddress(parkingLotDtoToMap.getAddress())
                .withDivision(parkingLotDtoToMap.getDivision())
                .withPricePerHour(parkingLotDtoToMap.getPricePerHour())
                .build();
        return createdParkingLot;
    }

    public ParkingLotDto mapParkingLotToDto(ParkingLot parkingLotToMap) {
        ParkingLotDto createdParkingLotDto = ParkingLotDto.ParkingLotDtoBuilder.aParkingLotDto()
                .withId(parkingLotToMap.getId())
                .withName(parkingLotToMap.getName())
                .withParkingLotCategory(parkingLotToMap.getParkingLotCategory())
                .withMaxCapacity(parkingLotToMap.getMaxCapacity())
                .withContactPerson(parkingLotToMap.getContactPerson())
                .withAddress(parkingLotToMap.getAddress())
                .withDivision(parkingLotToMap.getDivision())
                .withPricePerHour(parkingLotToMap.getPricePerHour())
                .build();
        return createdParkingLotDto;
    }

    public ParkingLotSummaryDto mapParkingLotToSummaryDto(ParkingLot parkingLotToMap) {
        ParkingLotSummaryDto createdParkingLotSummaryDto = ParkingLotSummaryDto.ParkingLotSummaryDtoBuilder.aParkingLotSummaryDto()
                .withId(parkingLotToMap.getId())
                .withName(parkingLotToMap.getName())
                .withMaxCapacity(parkingLotToMap.getMaxCapacity())
                .withContactPersonEmail(parkingLotToMap.getContactPerson().getEmailAddress())
                .withContactPersonPhone(parkingLotToMap.getContactPerson().getPhoneNumber())
                .withContactPersonMobile(parkingLotToMap.getContactPerson().getMobileNumber())
                .build();
        return createdParkingLotSummaryDto;
    }
}
