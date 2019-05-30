package com.atb.grpc.ninja.app;

import java.util.Date;

import com.atb.grpc.ninja.domain.BlockData;
import com.atb.grpc.ninja.grpc.client.BlockClient;

public class GrpcBlockChainApp {

	public static void main(String[] args) {
		BlockClient client=new BlockClient();
		
		client.addBlock(new BlockData("REF", "hash", "linkHash"));

	}

	
}
