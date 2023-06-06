<template>

    <v-card outlined>
        <v-card-title>
            UpdatePayment
        </v-card-title>

        <v-card-text>
            <String label="Id" v-model="value.id" :editMode="editMode"/>
            <Number label="Amount" v-model="value.amount" :editMode="editMode"/>
            <Date label="PaidDate" v-model="value.paidDate" :editMode="editMode"/>
        </v-card-text>

        <v-card-actions>
            <v-spacer></v-spacer>
            <v-btn
                    color="deep-purple lighten-2"
                    text
                    @click="updatePayment"
            >
                UpdatePayment
            </v-btn>
            
            <v-btn
                    color="deep-purple lighten-2"
                    text
                    @click="close"
            >
                Close
            </v-btn>
        </v-card-actions>
    </v-card>

</template>

<script>
   
    export default {
        name: 'UpdatePaymentCommand',
        components:{},
        props: {},
        data: () => ({
            editMode: true,
            value: {},
        }),
        created() {
            this.value.id = '';
            this.value.amount = 0;
            this.value.paidDate = '2023-06-06';
        },
        watch: {
        },
        methods: {
            updatePayment() {
                this.$emit('updatePayment', this.value);
            },
            close() {
                this.$emit('closeDialog');
            },
            change() {
                this.$emit('input', this.value);
            },
        }
    }
</script>

