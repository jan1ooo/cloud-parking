package com.jan1ooo.parking.controller;

import com.jan1ooo.parking.controller.dto.ParkingDTO;
import com.jan1ooo.parking.controller.mapper.ParkingMapper;
import com.jan1ooo.parking.model.Parking;
import com.jan1ooo.parking.service.ParkingService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/parking")
public class ParkingController {

    private final ParkingService parkingService;
    private final ParkingMapper parkingMapper;

    @GetMapping
    public List<ParkingDTO> findAll(){
       List<Parking> parkingList = parkingService.findAll();
       List<ParkingDTO> result = parkingMapper.toParkingDTOList(parkingList);
       return result;
    }


}
