package uk.co.nstech.websockets.adderservice;

import io.advantageous.qbit.reactive.Callback;

interface AdderServiceClientInterface {

	void add(Callback<Integer> callback, int a, int b);
}